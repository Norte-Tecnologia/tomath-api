package com.tomath.exception

import org.springframework.core.annotation.AnnotationUtils
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.servlet.ModelAndView
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler
import javax.servlet.http.HttpServletRequest

@ControllerAdvice
class CustomizedExceptionHandling : ResponseEntityExceptionHandler() {
    @ExceptionHandler(GenericException::class)
    fun handleExceptions(menssage: GenericException): ResponseEntity<Any> {
        return ResponseEntity(menssage.message, HttpStatus.INTERNAL_SERVER_ERROR)
    }

    @ExceptionHandler(Exception::class)
    @Throws(Exception::class)
    fun defaultErrorHandler(req: HttpServletRequest, e: Exception): ModelAndView {
        if (AnnotationUtils.findAnnotation(e.javaClass, ResponseStatus::class.java) != null) throw e
        val mav = ModelAndView()
        mav.addObject("exception", e)
        mav.addObject("url", req.requestURL)
        mav.viewName = DEFAULT_ERROR_VIEW
        return mav
    }

    companion object {
        const val DEFAULT_ERROR_VIEW = "error"
    }
}