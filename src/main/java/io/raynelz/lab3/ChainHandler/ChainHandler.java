package io.raynelz.lab3.ChainHandler;
import org.jetbrains.annotations.NotNull;


public interface ChainHandler {
    void process(@NotNull Request request);

    ChainHandler next();

    ChainHandler next(ChainHandler chainHandler);
}
