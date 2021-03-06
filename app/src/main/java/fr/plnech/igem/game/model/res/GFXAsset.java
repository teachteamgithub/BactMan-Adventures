/*
=======================================================================
BactMan Adventures | Scientific popularisation through mini-games
Copyright (C) 2015 IONIS iGEM Team
Distributed under the GNU GPLv3 License.
(See file LICENSE.txt or copy at https://www.gnu.org/licenses/gpl.txt)
=======================================================================
*/

package fr.plnech.igem.game.model.res;

public class GFXAsset extends Asset {
    private final int width;
    private final int height;
    private final int textureX;
    private final int textureY;

    private final int tileColumns;
    private final int tileRows;

    public GFXAsset(String filename, int width, int height, int textureX, int textureY, int tileColumns, int tileRows) {
        super(filename);
        this.width = width;
        this.height = height;
        this.textureX = textureX;
        this.textureY = textureY;
        this.tileColumns = tileColumns;
        this.tileRows = tileRows;
    }

    public GFXAsset(String filename, int width, int height, int textureX, int textureY) {
        this(filename, width, height, textureX, textureY, 1, 1);
    }

    public GFXAsset(String filename, int width, int height) {
        this(filename, width, height, 0, 0, 1, 1);
    }

    public int getHeight() {
        return height;
    }

    public int getTextureX() {
        return textureX;
    }

    public int getTextureY() {
        return textureY;
    }

    public int getTileColumns() {
        return tileColumns;
    }

    public boolean isTiled() {
        return tileColumns != 1 || tileRows != 1;
    }

    public int getTileRows() {
        return tileRows;
    }

    public int getWidth() {
        return width;
    }
}
