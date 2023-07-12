package io.ultims.quizmgtapp.shared.constant.route.v1;

public class ApiRoute {
    private static final String VERSION = "v1";
    private static final String BASE_ROUTE = "api" + "/" + VERSION;

    private ApiRoute() {
    }

    public static class Questions {

        private static final String RESSOURCE = "questions";

        public static final String GET_BY_ID = BASE_ROUTE + "/" + RESSOURCE + "/" + "{id}";

        private Questions() {
        }
    }
}
