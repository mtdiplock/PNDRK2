import kickstart._DemoPage
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_PNDRK2__DemoPage_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/_DemoPage/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: _DemoPageInstance, field: 'name', 'error'))
printHtmlPart(1)
invokeTag('message','g',4,['code':("_DemoPage.name.label"),'default':("Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',6,['class':("form-control"),'name':("name"),'value':(_DemoPageInstance?.name)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: _DemoPageInstance, field: 'name', 'error'))
printHtmlPart(4)
expressionOut.print(hasErrors(bean: _DemoPageInstance, field: 'myDate', 'error'))
printHtmlPart(5)
invokeTag('message','g',12,['code':("_DemoPage.myDate.label"),'default':("My Date")],-1)
printHtmlPart(2)
invokeTag('datePicker','bs',14,['class':("form-control"),'name':("myDate"),'precision':("day"),'value':(_DemoPageInstance?.myDate),'noSelection':(['': ''])],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: _DemoPageInstance, field: 'myDate', 'error'))
printHtmlPart(6)
expressionOut.print(hasErrors(bean: _DemoPageInstance, field: 'myBoolean', 'error'))
printHtmlPart(7)
invokeTag('message','g',21,['code':("_DemoPage.myBoolean.label"),'default':("My Boolean")],-1)
printHtmlPart(2)
invokeTag('checkBox','bs',22,['class':("form-control"),'name':("myBoolean"),'value':(_DemoPageInstance?.myBoolean)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: _DemoPageInstance, field: 'myBoolean', 'error'))
printHtmlPart(4)
expressionOut.print(hasErrors(bean: _DemoPageInstance, field: 'myInt', 'error'))
printHtmlPart(8)
invokeTag('message','g',28,['code':("_DemoPage.myInt.label"),'default':("My Int")],-1)
printHtmlPart(9)
invokeTag('field','g',30,['class':("form-control"),'type':("number"),'name':("myInt"),'required':(""),'value':(_DemoPageInstance.myInt)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: _DemoPageInstance, field: 'myInt', 'error'))
printHtmlPart(4)
expressionOut.print(hasErrors(bean: _DemoPageInstance, field: 'myShort', 'error'))
printHtmlPart(10)
invokeTag('message','g',36,['code':("_DemoPage.myShort.label"),'default':("My Short")],-1)
printHtmlPart(9)
invokeTag('field','g',38,['class':("form-control"),'type':("number"),'name':("myShort"),'required':(""),'value':(_DemoPageInstance.myShort)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: _DemoPageInstance, field: 'myShort', 'error'))
printHtmlPart(4)
expressionOut.print(hasErrors(bean: _DemoPageInstance, field: 'myLong', 'error'))
printHtmlPart(11)
invokeTag('message','g',44,['code':("_DemoPage.myLong.label"),'default':("My Long")],-1)
printHtmlPart(9)
invokeTag('field','g',46,['class':("form-control"),'type':("number"),'name':("myLong"),'required':(""),'value':(_DemoPageInstance.myLong)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: _DemoPageInstance, field: 'myLong', 'error'))
printHtmlPart(4)
expressionOut.print(hasErrors(bean: _DemoPageInstance, field: 'myFloat', 'error'))
printHtmlPart(12)
invokeTag('message','g',52,['code':("_DemoPage.myFloat.label"),'default':("My Float")],-1)
printHtmlPart(9)
invokeTag('field','g',54,['class':("form-control"),'type':("number"),'name':("myFloat"),'step':("any"),'required':(""),'value':(_DemoPageInstance.myFloat)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: _DemoPageInstance, field: 'myFloat', 'error'))
printHtmlPart(4)
expressionOut.print(hasErrors(bean: _DemoPageInstance, field: 'myDouble', 'error'))
printHtmlPart(13)
invokeTag('message','g',60,['code':("_DemoPage.myDouble.label"),'default':("My Double")],-1)
printHtmlPart(9)
invokeTag('field','g',62,['class':("form-control"),'type':("number"),'name':("myDouble"),'step':("any"),'required':(""),'value':(_DemoPageInstance.myDouble)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: _DemoPageInstance, field: 'myDouble', 'error'))
printHtmlPart(4)
expressionOut.print(hasErrors(bean: _DemoPageInstance, field: 'myByte', 'error'))
printHtmlPart(14)
invokeTag('message','g',68,['code':("_DemoPage.myByte.label"),'default':("My Byte")],-1)
printHtmlPart(9)
invokeTag('field','g',70,['class':("form-control"),'type':("number"),'name':("myByte"),'required':(""),'value':(_DemoPageInstance.myByte)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: _DemoPageInstance, field: 'myByte', 'error'))
printHtmlPart(4)
expressionOut.print(hasErrors(bean: _DemoPageInstance, field: 'myChar', 'error'))
printHtmlPart(15)
invokeTag('message','g',76,['code':("_DemoPage.myChar.label"),'default':("My Char")],-1)
printHtmlPart(9)
invokeTag('field','g',78,['class':("form-control"),'type':("number"),'name':("myChar"),'required':(""),'value':(_DemoPageInstance.myChar)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: _DemoPageInstance, field: 'myChar', 'error'))
printHtmlPart(4)
expressionOut.print(hasErrors(bean: _DemoPageInstance, field: 'myByteArray', 'error'))
printHtmlPart(16)
invokeTag('message','g',84,['code':("_DemoPage.myByteArray.label"),'default':("My Byte Array")],-1)
printHtmlPart(17)
expressionOut.print(hasErrors(bean: _DemoPageInstance, field: 'myByteArray', 'error'))
printHtmlPart(4)
expressionOut.print(hasErrors(bean: _DemoPageInstance, field: 'myInteger', 'error'))
printHtmlPart(18)
invokeTag('message','g',92,['code':("_DemoPage.myInteger.label"),'default':("My Integer")],-1)
printHtmlPart(2)
invokeTag('field','g',93,['class':("form-control"),'type':("number"),'name':("myInteger"),'value':(_DemoPageInstance.myInteger)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: _DemoPageInstance, field: 'myInteger', 'error'))
printHtmlPart(4)
expressionOut.print(hasErrors(bean: _DemoPageInstance, field: 'myTimeZone', 'error'))
printHtmlPart(19)
invokeTag('message','g',100,['code':("_DemoPage.myTimeZone.label"),'default':("My Time Zone")],-1)
printHtmlPart(2)
invokeTag('timeZoneSelect','g',102,['class':("form-control"),'name':("myTimeZone"),'value':(_DemoPageInstance?.myTimeZone),'noSelection':(['': ''])],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: _DemoPageInstance, field: 'myTimeZone', 'error'))
printHtmlPart(4)
expressionOut.print(hasErrors(bean: _DemoPageInstance, field: 'myLocale', 'error'))
printHtmlPart(20)
invokeTag('message','g',108,['code':("_DemoPage.myLocale.label"),'default':("My Locale")],-1)
printHtmlPart(2)
invokeTag('localeSelect','g',110,['class':("form-control"),'name':("myLocale"),'value':(_DemoPageInstance?.myLocale),'noSelection':(['': ''])],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: _DemoPageInstance, field: 'myLocale', 'error'))
printHtmlPart(4)
expressionOut.print(hasErrors(bean: _DemoPageInstance, field: 'myCurrency', 'error'))
printHtmlPart(21)
invokeTag('message','g',116,['code':("_DemoPage.myCurrency.label"),'default':("My Currency")],-1)
printHtmlPart(2)
invokeTag('currencySelect','g',118,['class':("form-control"),'name':("myCurrency"),'value':(_DemoPageInstance?.myCurrency),'noSelection':(['': ''])],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: _DemoPageInstance, field: 'myCurrency', 'error'))
printHtmlPart(4)
expressionOut.print(hasErrors(bean: _DemoPageInstance, field: 'myEnum', 'error'))
printHtmlPart(22)
invokeTag('message','g',124,['code':("_DemoPage.myEnum.label"),'default':("My Enum")],-1)
printHtmlPart(9)
invokeTag('select','g',127,['class':("form-control"),'name':("myEnum"),'from':(kickstart._DemoPage$Suit?.values()),'keys':(kickstart._DemoPage$Suit.values()*.name()),'required':(""),'value':(_DemoPageInstance?.myEnum?.name())],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: _DemoPageInstance, field: 'myEnum', 'error'))
printHtmlPart(23)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1397429084939L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [1, 131, 131, 131, 131, 131, 131, 1, 1, 1, 1, 1, 1, 1, 1, 3, 3, 4, 4, 6, 6, 7, 7, 11, 11, 12, 12, 14, 14, 15, 15, 19, 20, 21, 21, 22, 22, 22, 23, 23, 25, 28, 28, 30, 30, 30, 31, 32, 35, 36, 36, 38, 38, 39, 39, 41, 43, 44, 44, 46, 46, 46, 47, 48, 51, 52, 52, 54, 54, 55, 55, 59, 59, 60, 60, 62, 62, 63, 63, 67, 67, 68, 68, 70, 70, 71, 71, 72, 75, 76, 76, 78, 78, 78, 79, 80, 83, 84, 84, 86, 86, 87, 88, 92, 92, 93, 93, 94, 95, 95, 99, 100, 100, 102, 102, 102, 103, 103, 107, 108, 108, 110, 110, 110, 111, 111, 115, 116, 116, 118, 118, 118, 119, 119, 123, 124, 124, 127, 127, 127, 131, 131, 131, 131, 131, 131, 131, 131, 131, 131, 131, 131, 131, 131, 131],
	sourceName = "_form.gsp"
)
class ___LineNumberPlaceholder { }
