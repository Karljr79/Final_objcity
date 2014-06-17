public void setUpArrays()
{
  for (int i=0; i < numRows; i++)
  {
    for (int j=0; j < numCols; j++)
    {
      posXval[j] = startX + step * j;
    }
    posZval[i] = startZ + step * i;
  }
  
  for (int i=0; i < numRows; i++)
  {
    for (int j=0; j < numCols; j++)
    {
      pos[i][j] = new Position(this, posXval[i], 0, posZval[j]);
    }
  }
  
}
