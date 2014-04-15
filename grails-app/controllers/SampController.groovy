


class SampController {
	def index = {
		redirect(action: home)
    }
	def home = {
		render "in home"
		4+5
	}
	def other = {
		flash.message = "hello"
		render flash.message
	}
	
}
