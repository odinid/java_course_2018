package ox;

public class OXGame {

    private String[][] tables = new String[3][3];;

    public OXGame() {
        initialTables();
    }

    private void initialTables() {
        for (int i = 0; i < tables.length; i++) {
            for (int j = 0; j < tables.length; j++) {
                tables[i][j] = "";
            }
        }
    }

    public String[][] getTables() {
        return tables;
    }

    public Player getPlayer1() {
        return new Player();
    }

    public Player getPlayer2() {
        return new Player();
    }

    public void playWith(Player player, int i, int j) {
        tables[i][j] = player.getSymbol();
    }

    public String valueAt(int i, int j) {
        return tables[i][j];
    }

    public boolean isWinner() {
        String temp = "";
        
        temp = String.format("%s%s%s", valueAt(0, 0), valueAt(1, 1), valueAt(2, 2));
        System.out.println(temp);
        if ("XXX".equals(temp) || "OOO".equals(temp)) {
            return true;
        }
        
        temp = String.format("%s%s%s", valueAt(2, 0), valueAt(1, 1), valueAt(0, 2));
        if ("XXX".equals(temp) || "OOO".equals(temp)) {
            return true;
        }
        
        for (int row = 0; row < tables.length; row++) {
            String result = "";
            for (int column = 0; column < tables.length; column++) {
                if ("".equals(valueAt(row, column))) {
                    break;
                }

                result += valueAt(row, column);
            }

            // System.out.println(result);
            if ("XXX".equals(result) || "OOO".equals(result)) {
                return true;
            }
        }

        for (int column = 0; column < tables.length; column++) {
            String result = "";
            for (int row = 0; row < tables.length; row++) {
                if ("".equals(valueAt(row, column))) {
                    break;
                }

                result += valueAt(row, column);
            }

            // System.out.println(result);
            if ("XXX".equals(result) || "OOO".equals(result)) {
                return true;
            }
        }

        return false;
    }
}
