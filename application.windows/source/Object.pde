import saito.objloader.*;
 
class Object
{
  OBJModel model;
   
  Object(PApplet _applet, String model_name)
  {
    model = new OBJModel(_applet, model_name, "relative", TRIANGLES);
    model.disableDebug();
    model.scale(8);
  }
}

