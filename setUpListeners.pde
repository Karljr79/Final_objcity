public void SetUpListeners()
{
  c1 = new CallbackListener()
  {
    public void controlEvent(CallbackEvent theEvent)
    {
      switch(theEvent.getAction())
      {
        case(ControlP5.ACTION_ENTER):
          preview1.setVisible(true);
          break;
        case(ControlP5.ACTION_LEAVE):
          preview1.setVisible(false);
          break;
      }
    }
  };
  
  c2 = new CallbackListener()
  {
    public void controlEvent(CallbackEvent theEvent)
    {
      switch(theEvent.getAction())
      {
        case(ControlP5.ACTION_ENTER):
          preview2.setVisible(true);
          break;
        case(ControlP5.ACTION_LEAVE):
          preview2.setVisible(false);
          break;
      }
    }
  };
  
  c3 = new CallbackListener()
  {
    public void controlEvent(CallbackEvent theEvent)
    {
      switch(theEvent.getAction())
      {
        case(ControlP5.ACTION_ENTER):
          preview3.setVisible(true);
          break;
        case(ControlP5.ACTION_LEAVE):
          preview3.setVisible(false);
          break;
      }
    }
  };
  
  c4 = new CallbackListener()
  {
    public void controlEvent(CallbackEvent theEvent)
    {
      switch(theEvent.getAction())
      {
        case(ControlP5.ACTION_ENTER):
          preview4.setVisible(true);
          break;
        case(ControlP5.ACTION_LEAVE):
          preview4.setVisible(false);
          break;
      }
    }
  };
  
  c5 = new CallbackListener()
  {
    public void controlEvent(CallbackEvent theEvent)
    {
      switch(theEvent.getAction())
      {
        case(ControlP5.ACTION_ENTER):
          preview5.setVisible(true);
          break;
        case(ControlP5.ACTION_LEAVE):
          preview5.setVisible(false);
          break;
      }
    }
  };
  
  c6 = new CallbackListener()
  {
    public void controlEvent(CallbackEvent theEvent)
    {
      switch(theEvent.getAction())
      {
        case(ControlP5.ACTION_ENTER):
          preview6.setVisible(true);
          break;
        case(ControlP5.ACTION_LEAVE):
          preview6.setVisible(false);
          break;
      }
    }
  };
  
  c7 = new CallbackListener()
  {
    public void controlEvent(CallbackEvent theEvent)
    {
      switch(theEvent.getAction())
      {
        case(ControlP5.ACTION_ENTER):
          preview7.setVisible(true);
          break;
        case(ControlP5.ACTION_LEAVE):
          preview7.setVisible(false);
          break;
      }
    }
  };
  
  c8 = new CallbackListener()
  {
    public void controlEvent(CallbackEvent theEvent)
    {
      switch(theEvent.getAction())
      {
        case(ControlP5.ACTION_ENTER):
          preview8.setVisible(true);
          break;
        case(ControlP5.ACTION_LEAVE):
          preview8.setVisible(false);
          break;
      }
    }
  };
  
  cp = new CallbackListener()
  {
    public void controlEvent(CallbackEvent theEvent)
    {
      switch(theEvent.getAction())
      {
        case(ControlP5.ACTION_ENTER):
          previewP.setVisible(true);
          break;
        case(ControlP5.ACTION_LEAVE):
          previewP.setVisible(false);
          break;
      }
    }
  };
  
  cw = new CallbackListener()
  {
    public void controlEvent(CallbackEvent theEvent)
    {
      switch(theEvent.getAction())
      {
        case(ControlP5.ACTION_ENTER):
          previewW.setVisible(true);
          break;
        case(ControlP5.ACTION_LEAVE):
          previewW.setVisible(false);
          break;
      }
    }
  };
}
