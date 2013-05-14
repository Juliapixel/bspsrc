/*
 ** 2011 September 25
 **
 ** The author disclaims copyright to this source code.  In place of
 ** a legal notice, here is a blessing:
 **    May you do good and not evil.
 **    May you find forgiveness for yourself and forgive others.
 **    May you share freely, never taking more than you give.
 */
package info.ata4.bsplib.struct;

import info.ata4.bsplib.lump.LumpIO;
import info.ata4.bsplib.vector.Vector3f;
import java.io.IOException;

/**
 *
 * @author Nico Bergemann <barracuda415 at yahoo.de>
 */
public class DVertex implements DStruct {
    
    public Vector3f point;

    @Override
    public int getSize() {
        return 12;
    }

    @Override
    public void read(LumpIO lio) throws IOException {
        point = lio.readVector3f();
    }

    @Override
    public void write(LumpIO lio) throws IOException {
        lio.writeVector3f(point);
    }
    
}
