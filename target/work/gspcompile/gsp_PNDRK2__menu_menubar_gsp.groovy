import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_PNDRK2__menu_menubar_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/_menu/_menubar.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
loop:{
int i = 0
for( c in (grailsApplication.controllerClasses.sort { it.logicalPropertyName }) ) {
printHtmlPart(1)
expressionOut.print(params.controller == c.logicalPropertyName ? " active" : "")
printHtmlPart(2)
createTagBody(2, {->
printHtmlPart(3)
invokeTag('message','g',7,['code':("${c.logicalPropertyName}.label"),'default':(c.logicalPropertyName.capitalize())],-1)
printHtmlPart(4)
})
invokeTag('link','g',8,['controller':(c.logicalPropertyName),'action':("index")],2)
printHtmlPart(5)
i++
}
}
printHtmlPart(6)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1397429084989L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 4, 4, 4, 5, 5, 7, 7, 7, 8, 8, 8, 8, 10, 10, 10, 10, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "_menubar.gsp"
)
class ___LineNumberPlaceholder { }
