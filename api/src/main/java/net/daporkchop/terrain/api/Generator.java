/*
 * Adapted from the Wizardry License
 *
 * Copyright (c) 2019-2019 DaPorkchop_ and contributors
 *
 * Permission is hereby granted to any persons and/or organizations using this software to copy, modify, merge, publish, and distribute it. Said persons and/or organizations are not allowed to use the software or any derivatives of the work for commercial use or any other means to generate income, nor are they allowed to claim this software as their own.
 *
 * The persons and/or organizations are also disallowed from sub-licensing and/or trademarking this software without explicit permission from DaPorkchop_.
 *
 * Any persons and/or organizations using this software must disclose their source code and have it publicly available, include this license, provide sufficient credit to the original authors of the project (IE: DaPorkchop_), as well as provide a link to the original project.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NON INFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 */

package net.daporkchop.terrain.api;

import lombok.NonNull;
import net.daporkchop.lib.math.vector.d.Vec3d;
import net.daporkchop.terrain.api.implementation.Server;
import net.daporkchop.terrain.api.util.IBlockAccess;
import net.daporkchop.terrain.api.util.Initializeable;
import net.daporkchop.terrain.api.world.Chunk;
import net.daporkchop.terrain.api.world.Column;
import net.daporkchop.terrain.api.world.World;

/**
 * The core of any terrain generator implementation. This is the class that handles the actual terrain generation.
 *
 * @author DaPorkchop_
 */
public interface Generator extends Initializeable {
    @Override
    void init(@NonNull Server server, @NonNull World world);

    /**
     * Prepares a single column in a given world.
     *
     * @param world   the world that the column will be in
     * @param column  the column
     * @param columnX the x coordinate of the column (in columns)
     * @param columnZ the x coordinate of the column (in columns)
     */
    void prepareColumn(@NonNull World world, @NonNull Column column, int columnX, int columnZ);

    /**
     * Generates a single chunk in a given world.
     *
     * @param world  the world that the chunk will be in
     * @param column the column that the chunk will be in
     * @param chunkX the x coordinate of the chunk (in chunks)
     * @param chunkY the y coordinate of the chunk (in chunks)
     * @param chunkZ the z coordinate of the chunk (in chunks)
     * @return a chunk containing block data for the given coordinates
     */
    Chunk generateChunk(@NonNull World world, @NonNull Column column, int chunkX, int chunkY, int chunkZ);

    /**
     * Populates a chunk.
     * <p>
     * Population is different from generation because it requires the presence of neighboring chunks, as generated objects
     * might go over chunk borders.
     *
     * @param blocks a {@link IBlockAccess} that may be used to get and set blocks in the chunk and neighboring chunks. The
     *               coordinate (0,0,0) will be equivalent to the coordinate (8,8,8) in the chunk being populated. This
     *               gives populators an 8 block padding on all sides to overflow into without having to worry about chunk
     *               borders.
     * @param chunkX the x coordinate of the chunk (in chunks)
     * @param chunkY the y coordinate of the chunk (in chunks)
     * @param chunkZ the z coordinate of the chunk (in chunks)
     */
    void populateChunk(@NonNull IBlockAccess blocks, int chunkX, int chunkY, int chunkZ);

    /**
     * Finds the default spawn position.
     *
     * @return the default spawn position
     */
    default Vec3d computeSpawnPosition() {
        return new Vec3d(0.0d, 0.0d, 0.0d);
    }
}
