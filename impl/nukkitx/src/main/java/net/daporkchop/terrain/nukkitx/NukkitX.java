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

package net.daporkchop.terrain.nukkitx;

import com.nukkitx.api.Server;
import com.nukkitx.api.event.Listener;
import com.nukkitx.api.event.server.ServerInitializationEvent;
import com.nukkitx.api.event.server.ServerStartEvent;
import com.nukkitx.api.plugin.Plugin;
import com.nukkitx.api.plugin.PluginDescription;
import org.slf4j.Logger;

import javax.inject.Inject;
import java.nio.file.Path;

/**
 * @author DaPorkchop_
 */
@Plugin(
        id = "PTerrain",
        authors = {"PorkStudios"},
        version = "0.0.1-SNAPSHOT"
)
public class NukkitX {
    private final Logger logger;
    private final PluginDescription description;
    private final Path dataFolder;
    private final Server server;

    @Inject
    private NukkitX(Logger logger, PluginDescription description, Path dataFolder, Server server) {
        this.logger = logger;
        this.description = description;
        this.dataFolder = dataFolder;
        this.server = server;
    }

    @Listener
    public void onInitialization(ServerInitializationEvent event) {
        this.server.getGeneratorRegistry().register("PORK", NukkitGenerator::new);
    }

    @Listener
    public void onStart(ServerStartEvent event) {
        this.server. //TODO: i need a way to iterate over all configured levels
    }
}
