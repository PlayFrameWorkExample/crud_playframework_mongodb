package controllers


import javax.inject.Inject


import play.api.mvc._
import javax.inject._

/**
  * Created by acer on 10/7/2016.
  */
@Singleton
class UserController @Inject extends Controller{
      def index() = Action{
        Ok(views.html.users("user"));
      }
}
