import saito.objloader.*;

public class Position
{
  Object theModel;
  public int x;
  public int y;
  public int z;
  public float rotY;
  public String userData;
  
  public Position(PApplet _applet)
  {
    theModel = new Object(_applet, "blank.obj");
    this.x = 0;
    this.y = 0;
    this.z = 0;
    this.rotY = 0.0;
    userData = "0";
  }
  
  public Position(PApplet _applet, int x, int y, int z)
  {
    theModel = new Object(_applet, "blank.obj");
    this.x = x;
    this.y = y;
    this.z = z;
    this.rotY = 0.0;
    userData = "0";
  }
  
  public void setPos(int x, int y, int z)
  {
    this.x = x;
    this.y = y;
    this.z = z;
  }
  
  public void setRot(float rotation)
  {
    if (this.rotY >=360)
    {
      this.rotY = 0.0;
    }
    this.rotY += rotation;
  }
  
  public void setData(String data)
  {
    this.userData = data;
  }
  
  public void setModel(String model_name)
  {
    theModel.model.reset();
    theModel.model.load(model_name);
    theModel.model.scale(8);
  }
  
  public String getData()
  {
    return userData;
  }
  
  public void drawmodel()
  {
    pushMatrix();
    translate(x,y,z);
    rotateY(rotY);
    theModel.model.draw();
    popMatrix();
  }
}

