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

package net.daporkchop.terrain.api.util;

import lombok.NonNull;
import net.daporkchop.terrain.api.world.BlockState;

/**
 * A type that can access blocks at given coordinates.
 *
 * @author DaPorkchop_
 */
public interface IBlockAccess {
    /**
     * Gets the lowest X coordinate in this region at which there can still be blocks.
     * <p>
     * In most cases this will be -30'000'000.
     *
     * @return the lowest X coordinate in this region at which there can still be blocks
     */
    int minX();

    /**
     * Gets the highest X coordinate in this region at which there can still be blocks.
     * <p>
     * In most cases this will be 30'000'000.
     *
     * @return the highest X coordinate in this region at which there can still be blocks
     */
    int maxX();

    /**
     * Gets the lowest Y coordinate in this region at which there can still be blocks.
     * <p>
     * In most cases (except for Cubic Chunks) this will be 0.
     *
     * @return the lowest Y coordinate in this region at which there can still be blocks
     */
    int minY();

    /**
     * Gets the highest Y coordinate in this region at which there can still be blocks.
     * <p>
     * In most cases (except for Cubic Chunks) this will be 255.
     *
     * @return the highest Y coordinate in this region at which there can still be blocks
     */
    int maxY();

    /**
     * Gets the lowest Z coordinate in this region at which there can still be blocks.
     * <p>
     * In most cases this will be -30'000'000.
     *
     * @return the lowest Z coordinate in this region at which there can still be blocks
     */
    int minZ();

    /**
     * Gets the highest Z coordinate in this region at which there can still be blocks.
     * <p>
     * In most cases this will be 30'000'000.
     *
     * @return the highest Z coordinate in this region at which there can still be blocks
     */
    int maxZ();

    /**
     * Gets the {@link BlockState} at the given coordinates.
     *
     * @param x the X coordinate of the block. Must be between {@link #minX()} and {@link #maxX()} (inclusive)
     * @param y the Y coordinate of the block. Must be between {@link #minY()} and {@link #maxY()} (inclusive)
     * @param z the Z coordinate of the block. Must be between {@link #minZ()} and {@link #maxZ()} (inclusive)
     * @return the {@link BlockState} at the given coordinates
     * @throws IllegalArgumentException if the given coordinates are out of bounds
     */
    BlockState getBlock(int x, int y, int z);

    /**
     * Sets the {@link BlockState} at the given coordinates.
     *
     * @param x     the X coordinate of the block. Must be between {@link #minX()} and {@link #maxX()} (inclusive)
     * @param y     the Y coordinate of the block. Must be between {@link #minY()} and {@link #maxY()} (inclusive)
     * @param z     the Z coordinate of the block. Must be between {@link #minZ()} and {@link #maxZ()} (inclusive)
     * @param state the block state to change to
     * @throws IllegalArgumentException if the given coordinates are out of bounds
     * @throws NullPointerException     if the given block state is {@code null}
     */
    void setBlock(int x, int y, int z, @NonNull BlockState state);
}
