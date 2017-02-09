
import dynamic.IPluginLoader;
import dynamic.IServlet;
import dynamic.PluginRouter;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FreezingPluginLoader implements IPluginLoader {

    public static final Path basePath = Paths.get("/FreezePlugin/");

    public void init(PluginRouter router, String rootDirectory) {
        IServlet servlet = new FreezingPlugin();
        router.addRoute(basePath, servlet);
    }

    @Override
    public void unload(PluginRouter router) {
        router.removeRoute(basePath);
    }
}
