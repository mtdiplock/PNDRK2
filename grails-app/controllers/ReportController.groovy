


class ReportController {

	def index = { redirect(action:show) }
	
	def birtReportService
	
	def show = {
		def reportName="MemberGrowth"
		// response << "Hello World"
		def options = birtReportService.getRenderOption(request, 'html')
		// render options
		// def rptlst = birtReportService.listReports()
		// render rpslst
		def result=birtReportService.runAndRender(reportName, params, options)
		// render result
		render result 
		// response.contentType = 'text/html'
		// response.outputStream << result.toByteArray()
		return false
	}
}
	