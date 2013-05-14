/*
 ** 2013 February 14
 **
 ** The author disclaims copyright to this source code.  In place of
 ** a legal notice, here is a blessing:
 **    May you do good and not evil.
 **    May you find forgiveness for yourself and forgive others.
 **    May you share freely, never taking more than you give.
 */
package info.ata4.bsplib.struct;

import info.ata4.bsplib.lump.LumpIO;
import java.io.IOException;

/**
 * DFace variant for Vindictus that uses integers in place of shorts.
 * 
 * @author Nico Bergemann <barracuda415 at yahoo.de>
 */
public class DFaceVin extends DFace {
    
    private short unknown;
    
    @Override
    public int getSize() {
        return 72;
    }

    @Override
    public void read(LumpIO lio) throws IOException {
        pnum = lio.readInt();
        side = lio.readByte();
        onnode = lio.readByte();
        unknown = lio.readShort();
        fstedge = lio.readInt();
        numedge = (short) lio.readInt();
        texinfo = (short) lio.readInt();
        dispInfo = (short) lio.readInt();
        surfaceFogVolumeID = lio.readInt();
        lio.readFully(styles);
        lightofs = lio.readInt();
        area = lio.readFloat();
        lightmapTextureMinsInLuxels[0] = lio.readInt();
        lightmapTextureMinsInLuxels[1] = lio.readInt();
        lightmapTextureSizeInLuxels[0] = lio.readInt();
        lightmapTextureSizeInLuxels[1] = lio.readInt();
        origFace = lio.readInt();
        firstPrimID = lio.readInt();
        numPrims = lio.readInt();
        smoothingGroups = lio.readInt();
    }

    @Override
    public void write(LumpIO lio) throws IOException {
        lio.writeInt(pnum);
        lio.writeByte(side);
        lio.writeByte(onnode);
        lio.writeShort(unknown);
        lio.writeInt(fstedge);
        lio.writeInt(numedge);
        lio.writeInt(texinfo);
        lio.writeInt(dispInfo);
        lio.writeInt(surfaceFogVolumeID);
        lio.write(styles);
        lio.writeInt(lightofs);
        lio.writeFloat(area);
        lio.writeInt(lightmapTextureMinsInLuxels[0]);
        lio.writeInt(lightmapTextureMinsInLuxels[1]);
        lio.writeInt(lightmapTextureSizeInLuxels[0]);
        lio.writeInt(lightmapTextureSizeInLuxels[1]);
        lio.writeInt(origFace);
        lio.writeInt(firstPrimID);
        lio.writeInt(numPrims);
        lio.writeInt(smoothingGroups);
    }
}
