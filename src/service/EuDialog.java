package service;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;

import java.text.DecimalFormat;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class EuDialog {

    protected Object result;
    protected Shell shell;
    private Text infantryCountArmy1;
    private Text cavCountArmy1;
    private Text artCountArmy1;
    private Text infDiceArmy1;
    private Text cavDiceArmy1;
    private Text artDiceArmy1;
    private Text infantryCountArmy2;
    private Text cavCountArmy2;
    private Text artCountArmy2;
    private Text artDiceArmy2;
    private Text cavDiceArmy2;
    private Text infDiceArmy2;
    private Text resultsLog;

	/**
	 * Open the window.
	 * @wbp.parser.entryPoint
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

    /**
     * Create contents of the dialog.
     */
    private void createContents() {
		shell = new Shell();
		shell.setSize(545, 406);
		shell.setText("SWT Application");
    	
    	Label lblEuropaUniversalisBattle = new Label(shell, SWT.NONE);
    	lblEuropaUniversalisBattle.setAlignment(SWT.CENTER);
    	lblEuropaUniversalisBattle.setBounds(148, 10, 213, 14);
    	lblEuropaUniversalisBattle.setText("Europa Universalis Battle Simulator");
    	
    	Label label = new Label(shell, SWT.SEPARATOR | SWT.HORIZONTAL);
    	label.setBounds(0, 30, 545, 2);
    	
    	Label label_1 = new Label(shell, SWT.SEPARATOR | SWT.HORIZONTAL);
    	label_1.setBounds(0, 98, 545, 4);
    	
    	Label label_2 = new Label(shell, SWT.SEPARATOR | SWT.HORIZONTAL);
    	label_2.setBounds(0, 184, 545, 2);
    	
    	Label lblArmy = new Label(shell, SWT.NONE);
    	lblArmy.setBounds(10, 40, 59, 14);
    	lblArmy.setText("Army 1");
    	
    	Label lblArmy_1 = new Label(shell, SWT.NONE);
    	lblArmy_1.setBounds(10, 110, 59, 14);
    	lblArmy_1.setText("Army 2");
    	
    	Label lblResults = new Label(shell, SWT.NONE);
    	lblResults.setBounds(10, 196, 59, 14);
    	lblResults.setText("Results");
    	
    	Label lblInfantry = new Label(shell, SWT.NONE);
    	lblInfantry.setBounds(20, 56, 48, 14);
    	lblInfantry.setText("Infantry:");
    	
    	infantryCountArmy1 = new Text(shell, SWT.BORDER);
    	infantryCountArmy1.setBounds(75, 53, 35, 19);
    	infantryCountArmy1.setText("0");
    	
    	Label lblCavalry = new Label(shell, SWT.NONE);
    	lblCavalry.setBounds(116, 56, 48, 14);
    	lblCavalry.setText("Cavalry:");
    	
    	cavCountArmy1 = new Text(shell, SWT.BORDER);
    	cavCountArmy1.setBounds(170, 53, 48, 19);
    	cavCountArmy1.setText("0");

    	Label lblArtillery = new Label(shell, SWT.NONE);
    	lblArtillery.setBounds(224, 56, 48, 14);
    	lblArtillery.setText("Artillery:");
    	
    	artCountArmy1 = new Text(shell, SWT.BORDER);
    	artCountArmy1.setBounds(278, 53, 55, 19);
    	artCountArmy1.setText("0");

    	Label lblInfatryDice = new Label(shell, SWT.NONE);
    	lblInfatryDice.setBounds(14, 76, 97, 14);
    	lblInfatryDice.setText("Extra Infatry Dice:");
    	
    	infDiceArmy1 = new Text(shell, SWT.BORDER);
    	infDiceArmy1.setBounds(117, 73, 47, 19);
    	infDiceArmy1.setText("0");

    	Label lblCavalryDice = new Label(shell, SWT.NONE);
    	lblCavalryDice.setText("Extra Cavalry Dice:");
    	lblCavalryDice.setBounds(180, 78, 109, 14);
    	
    	cavDiceArmy1 = new Text(shell, SWT.BORDER);
    	cavDiceArmy1.setBounds(285, 73, 49, 19);
    	cavDiceArmy1.setText("0");

    	Label lblArtilleryDice = new Label(shell, SWT.NONE);
    	lblArtilleryDice.setText("Extra Artillery Dice:");
    	lblArtilleryDice.setBounds(340, 78, 111, 14);
    	
    	artDiceArmy1 = new Text(shell, SWT.BORDER);
    	artDiceArmy1.setBounds(454, 73, 43, 19);
    	artDiceArmy1.setText("0");

    	infantryCountArmy2 = new Text(shell, SWT.BORDER);
    	infantryCountArmy2.setBounds(64, 127, 49, 19);
    	infantryCountArmy2.setText("0");

    	Label label_3 = new Label(shell, SWT.NONE);
    	label_3.setText("Infantry:");
    	label_3.setBounds(10, 130, 48, 14);
    	
    	cavCountArmy2 = new Text(shell, SWT.BORDER);
    	cavCountArmy2.setBounds(177, 127, 48, 19);
    	cavCountArmy2.setText("0");

    	Label label_4 = new Label(shell, SWT.NONE);
    	label_4.setText("Cavalry:");
    	label_4.setBounds(123, 130, 48, 14);
    	
    	Label label_5 = new Label(shell, SWT.NONE);
    	label_5.setText("Artillery:");
    	label_5.setBounds(231, 130, 48, 14);
    	
    	artCountArmy2 = new Text(shell, SWT.BORDER);
    	artCountArmy2.setBounds(285, 127, 55, 19);
    	artCountArmy2.setText("0");

    	artDiceArmy2 = new Text(shell, SWT.BORDER);
    	artDiceArmy2.setBounds(454, 149, 48, 19);
    	artDiceArmy2.setText("0");

    	Label label_6 = new Label(shell, SWT.NONE);
    	label_6.setText("Extra Artillery Dice:");
    	label_6.setBounds(341, 152, 111, 14);
    	
    	cavDiceArmy2 = new Text(shell, SWT.BORDER);
    	cavDiceArmy2.setBounds(285, 149, 49, 19);
    	cavDiceArmy2.setText("0");

    	Label label_7 = new Label(shell, SWT.NONE);
    	label_7.setText("Extra Cavalry Dice:");
    	label_7.setBounds(177, 152, 103, 14);
    	
    	infDiceArmy2 = new Text(shell, SWT.BORDER);
    	infDiceArmy2.setBounds(117, 149, 54, 19);
    	infDiceArmy2.setText("0");

    	Label label_8 = new Label(shell, SWT.NONE);
    	label_8.setText("Extra Infatry Dice:");
    	label_8.setBounds(10, 152, 97, 14);
    	
    	resultsLog = new Text(shell, SWT.BORDER | SWT.READ_ONLY | SWT.V_SCROLL);
    	resultsLog.setBounds(10, 216, 525, 157);
    	resultsLog.setText("Welcome to the Europa Universalis the Board Game Battle Simulator.\nThis is a work in progress program by Patch on the Discord.");

    	
    	Button btnSingleRoundBattle = new Button(shell, SWT.CHECK);
    	btnSingleRoundBattle.setBounds(375, 7, 126, 18);
    	btnSingleRoundBattle.setText("Single Round Battle");
    	
    	Button tercios2 = new Button(shell, SWT.CHECK);
    	tercios2.setBounds(349, 107, 65, 18);
    	tercios2.setText("Tercios");
    	
    	Button nobleKnights2 = new Button(shell, SWT.CHECK);
    	nobleKnights2.setBounds(420, 107, 109, 18);
    	nobleKnights2.setText("Noble Knights");
    	
    	Button militaryDrill2 = new Button(shell, SWT.CHECK);
    	militaryDrill2.setBounds(375, 127, 94, 18);
    	militaryDrill2.setText("Military Drill");
    	
    	Button nobleKnights1 = new Button(shell, SWT.CHECK);
    	nobleKnights1.setText("Noble Knights");
    	nobleKnights1.setBounds(420, 32, 115, 18);
    	
    	Button terciosArmy1 = new Button(shell, SWT.CHECK);
    	terciosArmy1.setText("Tercios");
    	terciosArmy1.setBounds(349, 32, 65, 18);
    	
    	Button militaryDrill1 = new Button(shell, SWT.CHECK);
    	militaryDrill1.setText("Military Drill");
    	militaryDrill1.setBounds(359, 52, 94, 18);

    	
    	Button attackButton = new Button(shell, SWT.NONE);
    	attackButton.addSelectionListener(new SelectionAdapter() {
    		@Override
    		public void widgetSelected(SelectionEvent e) {
    			BattleSimulator battleSimulator = new BattleSimulator();
    			
    			boolean ifArmy1Tercios = terciosArmy1.getSelection();
    			boolean ifArmy1NobleKnights = nobleKnights1.getSelection();
    			boolean ifArmy1MilitaryDrill = militaryDrill1.getSelection();

    			boolean ifArmy2Tercios = tercios2.getSelection();
    			boolean ifArmy2NobleKnights = nobleKnights2.getSelection();
    			boolean ifArmy2MilitaryDrill = militaryDrill2.getSelection();
    			
    			General general1 = new General(Integer.parseInt(infDiceArmy1.getText()),
    					Integer.parseInt(cavDiceArmy1.getText()),
    					Integer.parseInt(artDiceArmy1.getText()));
    			
    			General general2 = new General(Integer.parseInt(infDiceArmy2.getText()),
    					Integer.parseInt(cavDiceArmy2.getText()),
    					Integer.parseInt(artDiceArmy2.getText()));
    			
    			
    			
    	        Double averageRemainingIn1 = 0.0, averageRemainingIn2 = 0.0, winCountForArmy1 = 0.0, winCountForArmy2 = 0.0, 
    	        		averageRemainingIn1Victories = 0.0, averageRemainingIn2Victories = 0.0;
    	        boolean isSingleRound = btnSingleRoundBattle.getSelection();
    	        for (int i = 0; i < 1000; i++) {
    	        	
        			Army army1 = new Army(false, general1, Integer.parseInt(infantryCountArmy1.getText()), 
        					Integer.parseInt(cavCountArmy1.getText()), 
        					Integer.parseInt(artCountArmy1.getText()), ifArmy1Tercios, ifArmy1NobleKnights, ifArmy1MilitaryDrill);

        			Army army2 = new Army(false, general2, Integer.parseInt(infantryCountArmy2.getText()), 
        					Integer.parseInt(cavCountArmy2.getText()), 
        					Integer.parseInt(artCountArmy2.getText()), ifArmy2Tercios, ifArmy2NobleKnights, ifArmy2MilitaryDrill);

        			BattleResult battleResult = battleSimulator.conductBattle(army1, army2, isSingleRound);
    	            averageRemainingIn1 += army1.getRemainingTroopCount();
    	            averageRemainingIn2 += army2.getRemainingTroopCount();
    	            
    	            if (battleResult.didArmyAWin) {
    	            	averageRemainingIn1Victories += army1.getRemainingTroopCount();
    	            } else {
    	            	averageRemainingIn2Victories += army2.getRemainingTroopCount();
    	            }
    	            
    	            if (army1.isDead()) {
    	                winCountForArmy2++;
    	            } else {
    	                winCountForArmy1++;
    	            }
    	        }

    	        averageRemainingIn1 = (averageRemainingIn1/1000);
    	        averageRemainingIn2 = (averageRemainingIn2/1000);
    	        
    	        averageRemainingIn1Victories = (averageRemainingIn1Victories/winCountForArmy1);
    	        averageRemainingIn2Victories = (averageRemainingIn2Victories/winCountForArmy2);

    	        if (winCountForArmy1 == 0.0) {
    	        	averageRemainingIn1Victories = 0.0;
    	        } 
    	        if (winCountForArmy2 == 0.0) {
    	        	averageRemainingIn2Victories = 0.0;
    	        }
    	        
    	        DecimalFormat numberFormat = new DecimalFormat("#.0");
    	        Double winPercentageForA = winCountForArmy1/1000;
    	        
    	        String formatted2Victories = numberFormat.format(averageRemainingIn2Victories);
    	        String formatted1Victories = numberFormat.format(averageRemainingIn1Victories);
    	        String formattedPercentage = numberFormat.format(winPercentageForA*100);
    	        
    	        StringBuilder stringBuilder = new StringBuilder();
    	        stringBuilder.append("Average Remaining in Army 1:  " + averageRemainingIn1 + "\n");
    	        stringBuilder.append("Average Remaining in Army 2:  " + averageRemainingIn2 + "\n");
    	        stringBuilder.append("Average Remaining in Army 1 in Victories:  " + formatted1Victories + "\n");
    	        stringBuilder.append("Average Remaining in Army 2 in Victories:  " + formatted2Victories + "\n");
    	        stringBuilder.append("Win Count for Army 1:         " + winCountForArmy1 + "\n");
    	        stringBuilder.append("Win Count for Army 2:         " + winCountForArmy2 + "\n");
    	        stringBuilder.append("Win Percentage for Army 1:         " + formattedPercentage + "%\n");
    	        stringBuilder.append("Note: Mutual Army Wipes count as wins for Army 2.\nTo simulate an attacker failing to take the area");

    	        resultsLog.setText(stringBuilder.toString());
    		}
    	});
    	attackButton.setBounds(441, 189, 94, 28);
    	attackButton.setText("Attack!");
    	    	
    }
}
