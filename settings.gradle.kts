rootProject.name = "tech-news-java-api"
include("src:main:model")
findProject(":src:main:model")?.name = "model"
