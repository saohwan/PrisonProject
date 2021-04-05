package PrisonDataSystem.cli.prison.controller;

import PrisonDataSystem.cli.prison.repository.MemoryPrisonRepository;
import PrisonDataSystem.cli.prison.repository.PrisonRepository;

public class PrisonController {

    private final PrisonRepository prisonRepository;


    public PrisonController() {
        prisonRepository = (PrisonRepository) new MemoryPrisonRepository();
    }

    //제어 기능 시작
    public void start() {
        while (true) {

            prisonerManagementScreen();
            int selection = inputInteger(">>> ");

            switch (selection) {
                cas1 : 1
            }
        }
    }
}

