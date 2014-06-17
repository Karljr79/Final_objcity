public void drawAllModels()
{
  for (int i=0; i < numRows; i++)
  {
    for (int j=0; j < numCols; j++)
    {
      pos[i][j].drawmodel();
    }
  }
  
}
