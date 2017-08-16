package fin.fin.dagger;

import java.net.Socket;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class scoketModule {

    @Provides
    @Singleton
    Socket provideSocket() {
        //this is unnecessary because empty constructor
        return new Socket();
    }
}
