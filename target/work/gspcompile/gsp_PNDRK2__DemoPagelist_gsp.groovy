import kickstart._DemoPage
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_PNDRK2__DemoPagelist_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/_DemoPage/list.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':("/"),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',7,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("kickstart")],-1)
printHtmlPart(2)
invokeTag('set','g',8,['var':("entityName"),'value':(message(code: '_DemoPage.label', default: '_DemoPage'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',9,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',9,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',9,[:],2)
printHtmlPart(0)
})
invokeTag('captureHead','sitemesh',10,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('sortableColumn','g',20,['property':("name"),'title':(message(code: '_DemoPage.name.label', default: 'Name'))],-1)
printHtmlPart(5)
invokeTag('sortableColumn','g',22,['property':("myDate"),'title':(message(code: '_DemoPage.myDate.label', default: 'My Date'))],-1)
printHtmlPart(5)
invokeTag('sortableColumn','g',24,['property':("myBoolean"),'title':(message(code: '_DemoPage.myBoolean.label', default: 'My Boolean'))],-1)
printHtmlPart(5)
invokeTag('sortableColumn','g',26,['property':("myInt"),'title':(message(code: '_DemoPage.myInt.label', default: 'My Int'))],-1)
printHtmlPart(5)
invokeTag('sortableColumn','g',28,['property':("myShort"),'title':(message(code: '_DemoPage.myShort.label', default: 'My Short'))],-1)
printHtmlPart(5)
invokeTag('sortableColumn','g',30,['property':("myLong"),'title':(message(code: '_DemoPage.myLong.label', default: 'My Long'))],-1)
printHtmlPart(6)
loop:{
int i = 0
for( _DemoPageInstance in (_DemoPageInstanceList) ) {
printHtmlPart(7)
expressionOut.print((i % 2) == 0 ? 'odd' : 'even')
printHtmlPart(8)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: _DemoPageInstance, field: "name"))
})
invokeTag('link','g',38,['action':("show"),'id':(_DemoPageInstance.id)],3)
printHtmlPart(9)
invokeTag('formatDate','g',40,['date':(_DemoPageInstance.myDate)],-1)
printHtmlPart(9)
invokeTag('formatBoolean','g',42,['boolean':(_DemoPageInstance.myBoolean)],-1)
printHtmlPart(9)
expressionOut.print(fieldValue(bean: _DemoPageInstance, field: "myInt"))
printHtmlPart(9)
expressionOut.print(fieldValue(bean: _DemoPageInstance, field: "myShort"))
printHtmlPart(9)
expressionOut.print(fieldValue(bean: _DemoPageInstance, field: "myLong"))
printHtmlPart(10)
i++
}
}
printHtmlPart(11)
invokeTag('paginate','bs',55,['total':(_DemoPageInstanceTotal)],-1)
printHtmlPart(12)
})
invokeTag('captureBody','sitemesh',59,[:],1)
printHtmlPart(13)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1397429084944L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 6, 6, 6, 7, 7, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 12, 20, 20, 20, 22, 22, 24, 24, 26, 26, 28, 28, 30, 30, 30, 35, 35, 35, 35, 36, 36, 38, 38, 38, 38, 38, 40, 40, 42, 42, 44, 44, 46, 46, 48, 48, 51, 51, 51, 51, 55, 55, 59, 59, 59, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "list.gsp"
)
class ___LineNumberPlaceholder { }
