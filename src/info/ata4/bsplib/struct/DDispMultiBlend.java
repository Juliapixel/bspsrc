/*
** 2012 March 12
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
import info.ata4.bsplib.vector.Vector4f;
import java.io.IOException;

/**
 * Displacement multiblend data structure.
 *
 * @author Sandern
 */
public class DDispMultiBlend implements DStruct {

    public static final int MAX_MULTIBLEND_CHANNELS = 4;
    
    public Vector4f multiblend;
    public Vector4f alphablend;
    public Vector3f[] multiblendcolors;

    public DDispMultiBlend() {
        this.multiblendcolors = new Vector3f[MAX_MULTIBLEND_CHANNELS];
    }

    @Override
    public int getSize() {
        return 80;
    }

    @Override
    public void read(LumpIO lio) throws IOException {
        multiblend = lio.readVector4f();
        alphablend = lio.readVector4f();
        
        for (int i = 0; i < MAX_MULTIBLEND_CHANNELS; i++) {
            multiblendcolors[i] = lio.readVector3f();
        }
    }

    @Override
    public void write(LumpIO lio) throws IOException {
        lio.writeVector4f(multiblend);
        lio.writeVector4f(alphablend);
        
        for (int i = 0; i < MAX_MULTIBLEND_CHANNELS; i++) {
            lio.writeVector3f(multiblendcolors[i]);
        }
    }
}
