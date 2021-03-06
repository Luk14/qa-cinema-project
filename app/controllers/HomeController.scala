package controllers


import play.api.mvc._

import javax.inject._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  /**
   * Create an Action to render an HTML page with a welcome message.
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index = Action { implicit request =>
    Ok(views.html.index())
  }

  def openingTimes = Action { implicit request =>
    Ok(views.html.openingtimes("Opening times"))
  }

  def gettingThere = Action { implicit request =>
    Ok(views.html.gettingthere())

  }

  def placesToGo = Action { implicit request =>
    Ok(views.html.placestogo())
  }
}
