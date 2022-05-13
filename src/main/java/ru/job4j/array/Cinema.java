package ru.job4j.array;

import java.util.Objects;

public class Cinema {
    public static Place checkEmptyPlace(Place[][] places) {
        Place place = new Place(-1, -1);
        for (int i = 0; i < places.length; i++) {
            for (int j = 0; j < places.length; j++) {
                if (places[i][j] == null && i < places.length - 1 && j < places.length - 1) {
                    if (places[i][j + 1] == null && places[i + 1][j] == null) {
                        place.row = i;
                        place.cell = j;
                        break;
                    }
                }
            }
        }
        if (place.row == -1) {
            place = null;
        }
        return place;
    }

    public static class Place {
        private int row;

        private int cell;

        public Place(int row, int cell) {
            this.row = row;
            this.cell = cell;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Place place = (Place) o;
            return row == place.row
                    &&
                    cell == place.cell;
        }

        @Override
        public int hashCode() {
            return Objects.hash(row, cell);
        }
    }
}