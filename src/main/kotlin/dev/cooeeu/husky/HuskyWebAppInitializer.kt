package dev.cooeeu.husky

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer

class HuskyWebAppInitializer : AbstractAnnotationConfigDispatcherServletInitializer() {
    override fun getServletMappings(): Array<String> {
        return arrayOf("/")
    }

    override fun getRootConfigClasses(): Array<Class<*>>? {
        return null
    }

    override fun getServletConfigClasses(): Array<Class<*>> {
        return arrayOf(HuskyWebConfig::class.java)
    }
}