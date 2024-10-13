fun Application.configureRouting()                                              {
    routing                                                                     {
        get("/")                                                                {
            call.respondHtml                                                    {
                head                                                            {
                    title                                                       {
                        +"Nyaaaaa"                                              }}
                body                                                            {
                    h1                                                          {
                        +"Hellonyaaaaaaa"                                       }
                    h3                                                          {
                        +"Finally I made a ktor example thing :3"               }
                    p                                                           {
                        +"Go to "
                        a                                                       {
                            href = "/tmdb"
                            +"/tmdb"                                            }
                        +" to see the Tmdb client in action"                    }
                    p                                                           {
                        +"Go to "
                        a                                                       {
                            href = "/Lucy"
                            +"/Lucy"                                            }
                        +" to play Lucy roulette"                               }}}}}}
