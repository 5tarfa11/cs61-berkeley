public class NBody {

    public static double readRadius(String fileName) {
        In fName = new In(fileName);
        int numOfPlanets = fName.readInt();
        double radiusUniverse = fName.readDouble();

        return radiusUniverse;
    }

    public static Body[] readBodies(String fileName) {
        In fName = new In(fileName);
        int numOfPlanets = fName.readInt();
        double radiusUniverse = fName.readDouble();
        Body[] bodies = new Body[5];
        int counter = 0;

        while (!fName.isEmpty() && counter < bodies.length) {
            double xxPos, yyPos, xxVel, yyVel, mass;
            String imgFileName;

            xxPos = fName.readDouble();
            yyPos = fName.readDouble();
            xxVel = fName.readDouble();
            yyVel = fName.readDouble();
            mass = fName.readDouble();
            imgFileName = fName.readString();

            bodies[counter] = new Body(xxPos, yyPos, xxVel, yyVel, mass, imgFileName);

            counter += 1;
        }

        return bodies;
    }
}