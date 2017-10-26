package co.sprayable.sleep.actions;

import co.sprayable.sleep.data.QuizData;
import co.sprayable.sleep.pages.Pages;
import qa.util.Random;
import qa.util.base.BaseActions;


public class QuizSleepVaultAction extends BaseActions {

    public void clickQuizTopAndAnswerQuestions(QuizData data){
        Pages.quizSleepVaultPage().clickTakeSleepQuizTop();
        Pages.takeSleepTypePage().selectGender(data.getGender());
        Pages.takeSleepTypePage().selectAge(data.getAge());
        Pages.takeSleepTypePage().selectCantFallAsleepTroubles();
        Pages.takeSleepTypePage().selectNightOwlHabits();
        Pages.takeSleepTypePage().selectTime_0_4_Asleep();
        Pages.takeSleepTypePage().selectHighlyStressed();
        Pages.takeSleepTypePage().selectLotsLightExposure();
        Pages.takeSleepTypePage().selectFrequentTraveler();
        Pages.takeSleepTypePage().waitProgressBar();
        Pages.takeSleepTypePage().setEmail(Random.genEmail());
        Pages.takeSleepTypePage().markTermsCheckBox();
    }

    public void clickQuizFooterAndAnswerQuestions(QuizData data){
        Pages.quizSleepVaultPage().scrollToFooterTakeSleepQuiz();
        Pages.quizSleepVaultPage().clickTakeSleepQuizFooter();
        Pages.takeSleepTypePage().selectGender(data.getGender());
        Pages.takeSleepTypePage().selectAge(data.getAge());
        Pages.takeSleepTypePage().selectCantFallAsleepTroubles();
        Pages.takeSleepTypePage().selectNightOwlHabits();
        Pages.takeSleepTypePage().selectTime_0_4_Asleep();
        Pages.takeSleepTypePage().selectHighlyStressed();
        Pages.takeSleepTypePage().selectLotsLightExposure();
        Pages.takeSleepTypePage().selectFrequentTraveler();
        Pages.takeSleepTypePage().waitProgressBar();
        Pages.takeSleepTypePage().setEmail(Random.genEmail());
        Pages.takeSleepTypePage().markTermsCheckBox();
    }
}
