import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_PNDRK2__errors_403_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/_errors/403.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',3,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',3,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("kickstart")],-1)
printHtmlPart(1)
invokeTag('set','g',5,['var':("layout_nomainmenu"),'value':(true),'scope':("request")],-1)
printHtmlPart(1)
invokeTag('set','g',6,['var':("layout_nosecondarymenu"),'value':(true),'scope':("request")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',7,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(3)
createClosureForHtmlPart(5, 2)
invokeTag('captureContent','sitemesh',12,['tag':("header")],2)
printHtmlPart(6)
invokeTag('message','g',18,['code':("error.403.callout")],-1)
printHtmlPart(7)
invokeTag('message','g',21,['code':("error.403.title")],-1)
printHtmlPart(8)
invokeTag('message','g',24,['code':("error.403.message")],-1)
printHtmlPart(9)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(10)
invokeTag('message','g',30,['code':("error.button.backToHome")],-1)
printHtmlPart(11)
expressionOut.print(createLink(uri: '/contact'))
printHtmlPart(12)
invokeTag('message','g',34,['code':("error.button.contactSupport")],-1)
printHtmlPart(13)
})
invokeTag('captureBody','sitemesh',42,[:],1)
printHtmlPart(14)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1397429084974L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 3, 3, 3, 3, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 7, 9, 10, 10, 12, 12, 12, 18, 18, 21, 21, 24, 24, 28, 28, 30, 30, 32, 32, 34, 34, 42, 42, 42, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "403.gsp"
)
class ___LineNumberPlaceholder { }
