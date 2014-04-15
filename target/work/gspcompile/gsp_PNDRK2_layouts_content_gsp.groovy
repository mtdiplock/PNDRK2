import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_PNDRK2_layouts_content_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/layouts/_content.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
if(true && (!layout_nomainmenu)) {
printHtmlPart(1)
invokeTag('render','g',4,['template':("/_menu/menubar")],-1)
printHtmlPart(2)
}
printHtmlPart(3)
if(true && (!layout_nosecondarymenu)) {
printHtmlPart(1)
invokeTag('render','g',9,['template':("/_menu/submenubar")],-1)
printHtmlPart(4)
}
printHtmlPart(5)
if(true && (flash.message && !layout_noflashmessage)) {
printHtmlPart(6)
expressionOut.print(flash.message)
printHtmlPart(7)
}
printHtmlPart(8)
invokeTag('layoutBody','g',18,[:],-1)
printHtmlPart(2)
invokeTag('pageProperty','g',19,['name':("page.body")],-1)
printHtmlPart(9)
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
	lines = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 4, 4, 5, 5, 5, 8, 9, 9, 10, 10, 10, 13, 13, 14, 14, 15, 15, 18, 19, 19, 19, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "_content.gsp"
)
class ___LineNumberPlaceholder { }
