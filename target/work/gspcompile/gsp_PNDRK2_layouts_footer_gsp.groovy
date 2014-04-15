import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_PNDRK2_layouts_footer_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/layouts/_footer.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(1)
invokeTag('message','g',9,['code':("default.home.label")],-1)
printHtmlPart(2)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(1)
invokeTag('message','g',13,['code':("default.tour.label")],-1)
printHtmlPart(3)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(1)
invokeTag('message','g',17,['code':("default.pricing.label")],-1)
printHtmlPart(4)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(1)
invokeTag('message','g',21,['code':("default.faq.label")],-1)
printHtmlPart(5)
expressionOut.print(createLink(uri: '/about'))
printHtmlPart(6)
invokeTag('message','g',31,['code':("default.about.label")],-1)
printHtmlPart(7)
expressionOut.print(createLink(uri: '/contact'))
printHtmlPart(6)
invokeTag('message','g',37,['code':("default.contact.label")],-1)
printHtmlPart(8)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1397429085004L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 9, 9, 9, 9, 13, 13, 13, 13, 17, 17, 17, 17, 21, 21, 21, 21, 30, 30, 31, 31, 36, 36, 37, 37, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "_footer.gsp"
)
class ___LineNumberPlaceholder { }
