package academy.devdojo.maratonajava.javacore.ZZJcrud.dominio;

import java.util.Objects;

public class Anime {
    private final Integer id;
    private final String name;
    private final int episodes;
    private final Producer producer;

    public Anime(Integer id, String name, int episodes, Producer producer) {
        this.id = id;
        this.name = name;
        this.episodes = episodes;
        this.producer = producer;
    }

    public static AnimeBuilder builder() {
        return new AnimeBuilder();
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getEpisodes() {
        return episodes;
    }

    public Producer getProducer() {
        return producer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Anime anime = (Anime) o;
        return episodes == anime.episodes &&
                Objects.equals(id, anime.id) &&
                Objects.equals(name, anime.name) &&
                Objects.equals(producer, anime.producer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, episodes, producer);
    }

    @Override
    public String toString() {
        return "Anime{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", episodes=" + episodes +
                ", producer=" + producer +
                '}';
    }

    public static class AnimeBuilder {
        private Integer id;
        private String name;
        private int episodes;
        private Producer producer;

        AnimeBuilder() {
        }

        public AnimeBuilder id(Integer id) {
            this.id = id;
            return this;
        }

        public AnimeBuilder name(String name) {
            this.name = name;
            return this;
        }

        public AnimeBuilder episodes(int episodes) {
            this.episodes = episodes;
            return this;
        }

        public AnimeBuilder producer(Producer producer) {
            this.producer = producer;
            return this;
        }

        public Anime build() {
            return new Anime(this.id, this.name, this.episodes, this.producer);
        }
    }
}
