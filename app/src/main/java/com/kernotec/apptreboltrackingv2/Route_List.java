package com.kernotec.apptreboltrackingv2;

public class Route_List {
    public String color;
    public String route_status;
    public String route_code;
    public String route_distances;

    public Route_List(String color, String route_status, String route_code, String route_distances) {
        this.color = color;
        this.route_status = route_status;
        this.route_code = route_code;
        this.route_distances = route_distances;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRoute_status() {
        return route_status;
    }

    public void setRoute_status(String route_status) {
        this.route_status = route_status;
    }

    public String getRoute_code() {
        return route_code;
    }

    public void setRoute_code(String route_code) {
        this.route_code = route_code;
    }

    public String getRoute_distances() {
        return route_distances;
    }

    public void setRoute_distances(String route_distances) {
        this.route_distances = route_distances;
    }
}
