import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_PNDRK2__menu_admin_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/_menu/_admin.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
invokeTag('message','g',4,['code':("default.admin.label")],-1)
printHtmlPart(1)
if((grails.util.Environment.current.name == 'development') && true) {
printHtmlPart(2)
expressionOut.print(createLink(uri: '/dbconsole'))
printHtmlPart(3)
invokeTag('message','g',14,['code':("default.dbconsole.label")],-1)
printHtmlPart(4)
}
printHtmlPart(2)
expressionOut.print(createLink(uri: '/systeminfo'))
printHtmlPart(5)
invokeTag('message','g',21,['code':("default.systeminfo.label")],-1)
printHtmlPart(6)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1397429084984L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 4, 10, 10, 12, 12, 14, 14, 17, 17, 19, 19, 21, 21, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "_admin.gsp"
)
class ___LineNumberPlaceholder { }
