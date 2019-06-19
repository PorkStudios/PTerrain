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

package net.daporkchop.terrain.api.implementation;

import lombok.NonNull;
import net.daporkchop.terrain.api.util.RegistryName;

/**
 * The server used by the current PTerrain implementation.
 * <p>
 * This enables access to various methods that terrain generators are likely to use in a platform-independent way.
 *
 * @author DaPorkchop_
 */
public interface Server {
    Server INSTANCE = null;

    /**
     * Creates (or retrieves from a cache) a {@link RegistryName} using a given modid and name.
     * @param modid the modid
     * @param name the name
     * @return a {@link RegistryName} with the given modid and name
     */
    RegistryName registryName(@NonNull String modid, @NonNull String name);

    /**
     * Creates (or retrieves from a cache) a {@link RegistryName} using a given name.
     * @param name the name
     * @return a {@link RegistryName} with the given name and the modid "minecraft"
     */
    default RegistryName registryName(@NonNull String name) {
        return this.registryName("minecraft", name);
    }
}
