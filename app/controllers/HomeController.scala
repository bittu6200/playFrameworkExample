package controllers



import models.Task

import javax.inject._
import play.api._
import play.api.data.Form
import play.api.data.Forms.nonEmptyText
import play.api.i18n.I18nSupport
import play.api.mvc._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(cc: MessagesControllerComponents) extends MessagesAbstractController(cc) {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
//  def index(name:String) = Action { implicit request: Request[AnyContent] =>
//    Ok(views.html.index(name))
//  }
//  def product(prodType:String,prodNum:Int)=Action{
//    Ok(s"product type is $prodType, product number is $prodNum")
//  }

  def index = Action { implicit request =>
    Redirect(routes.HomeController.tasks)
  }

  val taskForm: Form[String] = Form(
    "label" -> nonEmptyText
  )
 // def tasks=TODO

  def newTask: Action[AnyContent] = TODO

  def deleteTask(id:Long)=TODO

  def tasks = Action { implicit request=>
    Ok(views.html.index(Task.all(), taskForm))
  }


}
