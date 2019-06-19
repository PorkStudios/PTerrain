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

package net.daporkchop.terrain.api.world;

import net.daporkchop.terrain.api.util.IBlockAccess;

/**
 * A 1x1 column of multiple chunks stacked on top of each other vertically.
 *
 * @author DaPorkchop_
 */
public interface Column extends IBlockAccess {
    /**
     * Gets the lowest valid chunk Y coordinate in this column.
     * <p>
     * In most cases (except for Cubic Chunks) this will be 0.
     *
     * @return the lowest valid chunk Y coordinate in this column
     */
    int minChunkY();

    /**
     * Gets the highest valid chunk Y coordinate in this column.
     * <p>
     * In most cases (except for Cubic Chunks) this will be 15.
     *
     * @return the highest valid chunk Y coordinate in this column
     */
    int maxChunkY();

    /**
     * @return this column's X coordinate in the world
     */
    int x();

    /**
     * @return this column's Z coordinate in the world
     */
    int z();

    /**
     * Gets the chunk at the given y coordinate in this column.
     *
     * @param y the y coordinate of the chunk
     * @return the chunk at the given y coordinate, or {@code null} if it doesn't exist
     * @throws IllegalArgumentException if the given coordinate is out of bounds
     */
    Chunk getChunk(int y);
}
