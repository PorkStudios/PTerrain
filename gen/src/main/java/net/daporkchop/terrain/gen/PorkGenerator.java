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

package net.daporkchop.terrain.gen;

import lombok.NonNull;
import net.daporkchop.terrain.api.Generator;
import net.daporkchop.terrain.api.implementation.Server;
import net.daporkchop.terrain.api.util.IBlockAccess;
import net.daporkchop.terrain.api.world.Chunk;
import net.daporkchop.terrain.api.world.Column;
import net.daporkchop.terrain.api.world.World;

/**
 * The main generator class for porkian terrain generation.
 *
 * @author DaPorkchop_
 */
public class PorkGenerator implements Generator {
    @Override
    public void init(@NonNull Server server, @NonNull World world) {
    }

    @Override
    public void prepareColumn(@NonNull World world, @NonNull Column column, int columnX, int columnZ) {
    }

    @Override
    public Chunk generateChunk(@NonNull World world, @NonNull Column column, int chunkX, int chunkY, int chunkZ) {
        return null;
    }

    @Override
    public void populateChunk(@NonNull IBlockAccess blocks, int chunkX, int chunkY, int chunkZ) {
    }
}
