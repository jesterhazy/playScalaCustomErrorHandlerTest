package controllers

import play.api.mvc._

class Application extends Controller {
  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def error = Action {
    if (true) throw new Exception("an error!")
    Ok(views.html.index("You won't see this!."))
  }
}
