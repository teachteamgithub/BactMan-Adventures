/*
=======================================================================
BactMan Adventures | Scientific popularisation through mini-games
Copyright (C) 2015 IONIS iGEM Team
Distributed under the GNU GPLv3 License.
(See file LICENSE.txt or copy at https://www.gnu.org/licenses/gpl.txt)
=======================================================================
*/

package fr.plnech.igem.game.managers;

import android.graphics.Color;

public class ResMan {
    /* Global */
    public static final String SPLASH = "splash.png";
    public static final String SPLASH_LAND = "splash_land.png";
    public static final String FACE_BOX_TILED = "face_box_tiled.png";
    public static final String MENU_BG = "menu_background.png";
    public static final String MENU_RESET = "menu_reset.png";
    public static final String MENU_NEXT = "menu_next.png";
    public static final String MENU_QUIT = "menu_quit.png";

    /* BinGame */
    public static final String BIN_BG = "bins/background.png";
    public static final String BIN_SHARPS = "bins/bin_sharps.png";
    public static final String BIN_CHEMICAL = "bins/bin_chemical.png";
    public static final String BIN_REGULAR = "bins/bin_regular.png";
    public static final String BIN_BIO = "bins/bin_biohazard.png";

    public static final String ITEM_PEN = "bins/item_pen.png";
    public static final String ITEM_TUBE = "bins/item_tube.png";
    public static final String ITEM_CONE_BLUE = "bins/item_cone_blue.png";
    public static final String ITEM_CONE_WHITE = "bins/item_cone_white.png";
    public static final String ITEM_CONE_YELLOW = "bins/item_cone_yellow.png";

    public static final String ITEM_BECHER_ORANGE = "bins/item_becher_orange.png";
    public static final String ITEM_BECHER_RED = "bins/item_becher_red.png";
    public static final String ITEM_BECHER_GREEN = "bins/item_becher_green.png";
    public static final String ITEM_BECHER_BROKEN = "bins/item_becher_broken.png";
    public static final String ITEM_ERLEN_ORANGE = "bins/item_erlenmeyer_orange.png";
    public static final String ITEM_ERLEN_RED = "bins/item_erlenmeyer_red.png";
    public static final String ITEM_ERLEN_GREEN = "bins/item_erlenmeyer_green.png";
    public static final String ITEM_ERLEN_BROKEN = "bins/item_erlenmeyer_broken.png";
    public static final String ITEM_PAPER = "bins/item_paper.png";
    public static final String ITEM_PETRI = "bins/item_petri.png";
    public static final String ITEM_SLIDE = "bins/item_slide.png";
    public static final String ITEM_SLIDE_BROKEN = "bins/item_slide_broken.png";
    public static final String ITEM_GLOVES = "bins/item_gloves.png";
    public static final String ITEM_GEL = "bins/item_gel.png";
    public static final String ITEM_ROUNDFLASK_ORANGE = "bins/item_roundflask_orange.png";
    public static final String ITEM_ROUNDFLASK_RED = "bins/item_roundflask_red.png";
    public static final String ITEM_ROUNDFLASK_GREEN = "bins/item_roundflask_green.png";
    public static final String ITEM_ROUNDFLASK_BROKEN = "bins/item_roundflask_broken.png";
    public static final String ITEM_MICROTUBE_RED = "bins/item_microtube_red.png";
    public static final String ITEM_MICROTUBE_GREEN = "bins/item_microtube_green.png";

    public static final String HUD_LIVES = "hud_lives.png";
    public static final String HUD_SCORE = "hud_score.png";

    public static final String F_HUD_BIN = "Roboto-Black.ttf";
    public static final int F_HUD_BIN_SIZE = 40;
    public static final int F_HUD_BIN_COLOR = Color.BLACK;
    public static final boolean F_HUD_BIN_ANTI = true;

    /* PictoGame */
    public static final String CARD_BACK = "picto/card_back.png";
    public static final String CARD_BIOHAZARD = "picto/card_biohazard.png";
    public static final String CARD_CMR = "picto/card_CMR.png";
    public static final String CARD_ENVIRONMENT = "picto/card_environment.png";
    public static final String CARD_FACE = "picto/card_face.png";
    public static final String CARD_FLAMMABLE = "picto/card_flammable.png";
    public static final String CARD_GLOVES = "picto/card_gloves.png";
    public static final String CARD_MASK = "picto/card_mask.png";
    public static final String CARD_OXIDISING = "picto/card_oxidising.png";
    public static final String CARD_RADIOACTIVE = "picto/card_radioactive.png";
    public static final String CARD_TOXIC = "picto/card_toxic.png";
    public static final String CARD_EYE = "picto/card_eye.png";
    public static final String CARD_SHOWER = "picto/card_shower.png";

    public static final String HUD_TIME = "hud_time.png";

    public static final int F_HUD_PICTO_COLOR = Color.WHITE;

    /* GutGame */
    public static final String GUT_BACTMAN = "gut/bactman.png";
    public static final String GUT_ANTIBIO = "gut/antibiotic.png";
    public static final String GUT_PHAGE = "gut/phage.png";
    public static final String GUT_PROTEIN = "gut/protein.png";
    public static final String GUT_VITAMIN = "gut/vitamine.png";

    public static final String GUT_BG = "gut/background.png";
    public static final String GUT_FLOW = "gut/flow.png";

    public static final String F_HUD_GUT = "Roboto-Medium.ttf";
    public static final int F_HUD_GUT_SIZE = 30;

    /* PianoGame */
    public static final String PIANO_BG = "piano/background.png";
    public static final String PIANO_SHADER_OK = "piano/base_shader_valid.png";
    public static final String PIANO_SHADER_KO = "piano/base_shader_invalid.png";
    public static final String PIANO_L_PHO = "piano/base_l_phosphate.png";
    public static final String PIANO_L_PHO_CPL = "piano/base_l_phosphate_cpl.png";
    public static final String PIANO_POLY = "piano/polymerase.png";
    public static final String PIANO_A = "piano/base_a.png";
    public static final String PIANO_A_CPL = "piano/base_a_cpl.png";
    public static final String PIANO_T = "piano/base_t.png";
    public static final String PIANO_T_CPL = "piano/base_t_cpl.png";
    public static final String PIANO_G = "piano/base_g.png";
    public static final String PIANO_G_CPL = "piano/base_g_cpl.png";
    public static final String PIANO_C = "piano/base_c.png";
    public static final String PIANO_C_CPL = "piano/base_c_cpl.png";

    /* Sounds */
    public static final String SOUND_SUCCESS = "coin.ogg";
    public static final String SOUND_FAILURE = "bash.wav";

    /* Prof introductions */
    public static final String PROF_BIN_1 = "prof/bin_1.png";
    public static final String PROF_BIN_2 = "prof/bin_2.png";
    public static final String PROF_BIN_3 = "prof/bin_3.png";
    public static final String PROF_BIN_4 = "prof/bin_4.png";
    public static final String PROF_BIN_5 = "prof/bin_5.png";
    public static final String PROF_BIN_6 = "prof/bin_6.png";

    public static final String PROF_GUT_1 = "prof/gut_1.png";
    public static final String PROF_GUT_2 = "prof/gut_2.png";

    public static final String PROF_PIANO_1 = "prof/piano_1.png";
    public static final String PROF_PIANO_2 = "prof/piano_2.png";

    public static final String PROF_MEMO_1 = "prof/memo_1.png";
    public static final String PROF_MEMO_2 = "prof/memo_2.png";
    public static final String PROF_MEMO_3 = "prof/memo_3.png";
    public static final String PROF_MEMO_4 = "prof/memo_4.png";
    public static final String PROF_MEMO_5 = "prof/memo_5.png";

    public static final String PROF_BIN_1_FR = "prof/bin_1_fr.png";
    public static final String PROF_BIN_2_FR = "prof/bin_2_fr.png";
    public static final String PROF_BIN_3_FR = "prof/bin_3_fr.png";
    public static final String PROF_BIN_4_FR = "prof/bin_4_fr.png";
    public static final String PROF_BIN_5_FR = "prof/bin_5_fr.png";
    public static final String PROF_BIN_6_FR = "prof/bin_6_fr.png";

    public static final String PROF_GUT_1_FR = "prof/gut_1_fr.png";
    public static final String PROF_GUT_2_FR = "prof/gut_2_fr.png";

    public static final String PROF_PIANO_1_FR = "prof/piano_1_fr.png";
    public static final String PROF_PIANO_2_FR = "prof/piano_2_fr.png";

    public static final String PROF_MEMO_1_FR = "prof/memo_1_fr.png";
    public static final String PROF_MEMO_2_FR = "prof/memo_2_fr.png";
    public static final String PROF_MEMO_3_FR = "prof/memo_3_fr.png";
    public static final String PROF_MEMO_4_FR = "prof/memo_4_fr.png";
    public static final String PROF_MEMO_5_FR = "prof/memo_5_fr.png";
}
