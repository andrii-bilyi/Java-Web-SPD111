package step.learning.ioc;

import com.google.inject.servlet.ServletModule;
import step.learning.serviets.*;

public class RouterModule extends ServletModule {
    @Override
    protected void configureServlets() {
        serve("/").with(HomeServlet.class);
        serve("/cart").with(CartServlet.class);
        serve("/signup").with(SignupServlet.class);
    }
}
