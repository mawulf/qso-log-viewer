/*
 * Copyright (C) 2018 G. Keith Cambron
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package qsologviewer;

/**
 *
 * @author keithc
 */
public class QsoLogViewer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        if(args.length == 1 && args[0].contains("-v")) {
            System.out.println(VERSION);
            System.exit(0);
        }
        QsoInitFile initFile = QsoInitFile.getInstance();
        initFile.open();
        QsoLogWindow logWin = new QsoLogWindow(null);
        logWin.run();
    }
    
    // Properties
    public static final String VERSION = "QsoLogViewer 1.1.2";
    public static final String AUTHOR = "by G. Keith Cambron KC1ATT";
    public static final String WEBSITE = "www.radiocheck.us";
}
