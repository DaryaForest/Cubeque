package co.sprayable.sleep.actions;

import qa.util.base.BaseActions;
import qa.util.base.ObjectsCollection;

public final class Actions {
    private static ObjectsCollection<BaseActions> actions = new ObjectsCollection<>();

    public static void clear() {
        actions.clear();
    }

    public static MainActions mainActions() { return actions.getInstance(MainActions.class); }

    public static TakeSleepTypeQuizAction takeSleepTypeQuizAction() { return actions.getInstance(TakeSleepTypeQuizAction.class); }

    public static CheckoutAction checkoutAction() {
        return actions.getInstance(CheckoutAction.class);
    }

    public static GetsSleepAction getsSleepAction() {
        return actions.getInstance(GetsSleepAction.class);
    }

    public static PowerfulFoodsActions powerfulFoodsActions() { return actions.getInstance(PowerfulFoodsActions.class); }

    public static CheatSheetThankYouActions cheatSheetThankYouActions() { return actions.getInstance(CheatSheetThankYouActions.class); }

    public static CheatSheetActions cheatSheetActions() { return actions.getInstance(CheatSheetActions.class); }

    public static LimitedTimeOfferActions limitedTimeOfferActions() { return actions.getInstance(LimitedTimeOfferActions.class); }

    public static UltimateOfferActions ultimateOfferActions() { return actions.getInstance(UltimateOfferActions.class); }

    public static SleepSpecialOfferActions sleepSpecialOfferActions() { return actions.getInstance(SleepSpecialOfferActions.class); }

    public static SpecialAffordableOfferActions specialAffordableOfferActions() {
       return actions.getInstance(SpecialAffordableOfferActions.class);
    }

    public static SleepSprayableVslActions sleepSprayableVslActions() { return actions.getInstance(SleepSprayableVslActions.class ); }

    public static OrderActions orderActions() { return actions.getInstance(OrderActions.class); }

    public static SleepSprayableVipActions sleepSprayableVipActions() {
        return actions.getInstance(SleepSprayableVipActions.class); }

    public static SleepSprayableVipFreeActions sleepSprayableVipFreeActions() {
        return actions.getInstance(SleepSprayableVipFreeActions.class);
    }

    public static OrderFreeTrialSubscriptionActions orderFreeTrialSubscriptionActions() {
        return actions.getInstance(OrderFreeTrialSubscriptionActions.class);
    }

    public static SpecialOrderActions specialOrderActions() { return actions.getInstance(SpecialOrderActions.class); }

    public static OrderGetSleepActions orderGetSleepActions() { return actions.getInstance(OrderGetSleepActions.class); }

    public static OrderFreeTrialActions orderFreeTrialActions() { return actions.getInstance(OrderFreeTrialActions.class); }

    public static GetSleepTwoActions getSleepTwoActions() { return actions.getInstance(GetSleepTwoActions.class); }

    public static GetFreeTrialActions getFreeTrialActions() { return actions.getInstance(GetFreeTrialActions.class); }

    public static NoMoreJetLagActions noMoreJetLagActions() { return actions.getInstance(NoMoreJetLagActions.class); }

    public static EnergyLifetimeSubscriptionActions energyLifetimeSubscriptionActions() {
        return actions.getInstance(EnergyLifetimeSubscriptionActions.class);
    }

    public static IggOrderSpecialActions iggOrderSpecialActions() { return actions.getInstance(IggOrderSpecialActions.class); }

    public static SubscriberOfferActions subscriberOfferActions() { return actions.getInstance(SubscriberOfferActions.class); }

    public static HomeNewActions homeNewActions() { return actions.getInstance(HomeNewActions.class); }

    public static SleepHackerActions sleepHackerActions() { return actions.getInstance(SleepHackerActions.class); }

    public static PharmaCompaniesHateMiracleSprayAction pharmaCompaniesHateMiracleSprayAction(){
        return actions.getInstance(PharmaCompaniesHateMiracleSprayAction.class);
    }

    public static FallMiracleSprayableAction fallMiracleSprayableAction(){
        return actions.getInstance(FallMiracleSprayableAction.class);
    }

    public static GrandSprayableSleepActions grandSprayableSleepActions(){
        return actions.getInstance(GrandSprayableSleepActions.class);
    }

    public static GrandSprayableEsAction grandSprayableEsAction(){
        return actions.getInstance(GrandSprayableEsAction.class);
    }

    public static GetSprayableAction getSprayableAction(){
        return actions.getInstance(GetSprayableAction.class);
    }

    public static ThankYouSalesAction thankYouSalesAction(){
        return actions.getInstance(ThankYouSalesAction.class);
    }

    public static QuizSleepVaultAction quizSleepVaultAction(){
        return actions.getInstance(QuizSleepVaultAction.class);
    }

    public static SprayableResultsTypeAction sprayableResultsTypeAction(){
        return actions.getInstance(SprayableResultsTypeAction.class);
    }

    public static OrderEnergyAction orderEnergyAction(){
        return actions.getInstance(OrderEnergyAction.class);
    }

    public static ProductOrderAction productOrderAction(){
        return actions.getInstance(ProductOrderAction.class);
    }

    public static ProductOrderTrialAction productOrderTrialAction(){
        return actions.getInstance(ProductOrderTrialAction.class);
    }

    public static FallAsleepEasilyAction fallAsleepEasilyAction(){
        return actions.getInstance(FallAsleepEasilyAction.class);
    }

    public static ProductOrder25Action productOrder25Action(){
        return actions.getInstance(ProductOrder25Action.class);
    }

    public static CompaniasFarmaceuticasOdianAction companiasFarmaceuticasOdianAction(){
        return actions.getInstance(CompaniasFarmaceuticasOdianAction.class);
    }

    public static EnergyProductOrderAction energyProductOrderAction(){
        return actions.getInstance(EnergyProductOrderAction.class);
    }

    public static FountainOfYouthAction fountainOfYouthAction(){
        return actions.getInstance(FountainOfYouthAction.class);
    }
    public static EnergyVipActions energyVipActions(){
        return actions.getInstance(EnergyVipActions.class);
    }
    public static EnergyTrialAction energyTrialAction(){
        return actions.getInstance(EnergyTrialAction.class);
    }
    public static TrySprayableSleepFirstMonthOneDollarAction trySprayableSleepFirstMonthOneDollarAction(){
        return actions.getInstance(TrySprayableSleepFirstMonthOneDollarAction.class);
    }
    public static TrySprayablesSeepFirstMonthFreeAction trySprayablesSeepFirstMonthFreeAction(){
        return actions.getInstance(TrySprayablesSeepFirstMonthFreeAction.class);
    }
    public static DiscountOfferAction discountOfferAction(){
        return actions.getInstance(DiscountOfferAction.class);
    }
    public static FindOutMoreActions findOutMoreActions(){
        return actions.getInstance(FindOutMoreActions.class);
    }
    public static CheckOutActionNew checkOutActionNew(){
        return actions.getInstance(CheckOutActionNew.class);
    }

    public static EnergySubscriptionActions sleepSleepSubscriptionActions(){
        return actions.getInstance(EnergySubscriptionActions.class);
    }
    public static SleepIngredientsAction sleepIngredientsAction(){
        return actions.getInstance(SleepIngredientsAction.class);
    }
    public static SleepEnergyCircadianRythmAction sleepEnergyCircadianRythmAction(){
        return actions.getInstance(SleepEnergyCircadianRythmAction.class);
    }
    public static SleepSubscriptionActions sleepSubscriptionActions(){
        return actions.getInstance(SleepSubscriptionActions.class);
    }
    public static BuySprayableEnergyActions buySprayableEnergyActions(){
        return actions.getInstance(BuySprayableEnergyActions.class);
    }
    public static EnergyFreeTrialAction energyFreeTrialAction(){
        return actions.getInstance(EnergyFreeTrialAction.class);
    }
    public static SprayableSleepHomeActions sprayableSleepHomeActions(){
        return actions.getInstance(SprayableSleepHomeActions.class);
    }
    public static SprayableNotEnoughtSleepActions sprayableNotEnoughtSleepActions(){
        return actions.getInstance(SprayableNotEnoughtSleepActions.class);
    }
    public static EnergyHomeActions energyHomeActions(){
        return actions.getInstance(EnergyHomeActions.class);
    }
    public static EightHoursNightActions eightHoursNightActions(){
        return actions.getInstance(EightHoursNightActions.class);
    }
    public static LandingStayAsleepLongerAction landingStayAsleepLongerAction(){
        return actions.getInstance(LandingStayAsleepLongerAction.class);
    }
    public static EnergyToSpareAction energyToSpareAction(){
        return actions.getInstance(EnergyToSpareAction.class);
    }
    public static ProductOrder25EsActions productOrder25EsActions(){
        return actions.getInstance(ProductOrder25EsActions.class);
    }
}