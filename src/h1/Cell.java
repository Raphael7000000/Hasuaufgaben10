package h1;

public class Cell {

    private int indexRow;
    private int indexCol;
    private boolean alive;

    public int numLivingNeighbors;
    public boolean isAliveNextGen;

    public Cell(int indexRow, int indexCol, boolean alive) {
        this.indexRow = indexRow;
        this.indexCol = indexCol;
        this.alive = alive;
    }

    
    public int getIndexRow() {
        return indexRow;
    }

    public int getIndexCol() {
        return indexCol;
    }

    public boolean isAlive() {
        return alive;
    }

    public int getNumLivingNeighbors() {
        return numLivingNeighbors;
    }

    public boolean getAliveNextGen() {
        return isAliveNextGen;
    }

   
    public void setIndexRow(int indexRow) {
        this.indexRow = indexRow;
    }

    public void setIndexCol(int indexCol) {
        this.indexCol = indexCol;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public void setNumLivingNeighbors(int numLivingNeighbors) {
        this.numLivingNeighbors = numLivingNeighbors;
    }

    public void setAliveNextGen(boolean aliveNextGen) {
        this.isAliveNextGen = aliveNextGen;
    }

    public void countLivingNeighbours(Cell[][] gridArray) {

        int livingNeighbors = 0;

        for (int dr = -1; dr <= 1; dr++) {
            for (int dc = -1; dc <= 1; dc++) {

                if (dr == 0 && dc == 0) {
                    continue;
                }

                int nr = indexRow + dr;
                int nc = indexCol + dc;

                if (nr >= 0 && nr < gridArray.length
                        && nc >= 0 && nc < gridArray[0].length) {

                    if (gridArray[nr][nc].isAlive()) {
                        livingNeighbors++;
                    }
                }
            }
        }

        setNumLivingNeighbors(livingNeighbors);

        if (alive) {
            setAliveNextGen(livingNeighbors == 2 || livingNeighbors == 3);
        } else {
            setAliveNextGen(livingNeighbors == 3);
        }
    }
}



