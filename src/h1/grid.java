package h1;

public class grid {
	Cell[][] gridArray;
	
	public Cell[][] getArray(){
		
		return gridArray;
	}
	  public void setGridArray(Cell[][] gridArray) {
	        this.gridArray = gridArray;
	    }
	  
	
	
	
public void Grid(Cell[] cells, int gridRows, int gridCols){
		
	
    gridArray = new Cell[gridRows][gridCols];

   
    for (int r = 0; r < gridRows; r++) {
        for (int c = 0; c < gridCols; c++) {
            gridArray[r][c] = new Cell(r, c);
            gridArray[r][c].setAlive(false);
        }
    }

   
    if (cells != null) {
        for (Cell cell : cells) {
            int r = cell.getIndexRow();
            int c = cell.getIndexCol();

            if (r >= 0 && r < gridRows && c >= 0 && c < gridCols) {
                gridArray[r][c].setAlive(true);
            }
        }
    }
	
		
	}
	
		
		
	}
	public void nextNextGen() {
		
		
		  for (int r = 0; r < gridArray.length; r++) {
		        for (int c = 0; c < gridArray[0].length; c++) {
		            Cell cell = gridArray[r][c];
		            cell.setAlive(cell.getAliveNextGen());
		        }
		        
		       
		
	}
	public void computeGeneration(int n) {
		
		if (n <= 0) {
	        return;
	    }

	    for (int i = 0; i < n; i++) {
	        nextNextGen();
	    }
	}	
	}
	
	}
