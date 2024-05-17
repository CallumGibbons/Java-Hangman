import java.util.Random;

public class WordSelector {
    private static final String[] WORDS = {
            "ABSTRACT", "BANANA", "COMPLEX", "DISTINCT", "ENIGMA", "FOCUS", "GALAXY", "HORIZON", "IMPACT",
            "JAZZ", "KNIGHT", "LABYRINTH", "MAGIC", "NEBULA", "OCEAN", "PIXEL", "QUIET", "RHYTHM", "SYMBOL",
            "TREASURE", "UNIQUE", "VICTORY", "WIZARD", "XENON", "YACHT", "ZENITH", "ALCHEMY", "BEACON",
            "CYCLONE", "DRAGON", "ECLIPSE", "FROST", "GARNET", "HARMONY", "ILLUSION", "JUBILEE", "KERNEL",
            "LEGEND", "MYSTERY", "NEXUS", "ORACLE", "PHANTOM", "QUARTZ", "REVENUE", "SPECTRUM", "TEMPEST",
            "UMBRELLA", "VORTEX", "WHISPER", "XENOPHOBIA", "YEARLING", "ZEALOT", "ACUMEN", "BRILLIANT",
            "CALIBER", "DYNAMIC", "EPIC", "FORTUNE", "GLOW", "HEROIC", "INSIGHT", "JOVIAL", "KINETIC",
            "LUCKY", "MELODY", "NOBLE", "OPTIMISM", "PIONEER", "QUINTESSENCE", "RADIANT", "SERENITY",
            "TRIUMPH", "UTILITY", "VALOR", "WONDER", "XENOGENESIS", "YOUTHFUL", "ZEALOUS", "AURA", "BRAVO",
            "CHAMPION", "DAZZLE", "ELEGANCE", "FLAWLESS", "GRANDEUR", "HORIZON", "INFINITY", "JOVIALITY",
            "KINGDOM", "LEGACY", "MONUMENT", "NIRVANA", "ODYSSEY", "PARADISE", "QUASAR", "REVELATION",
            "SYMPHONY", "THRIVE", "UTOPIA", "VICTORIOUS", "WONDROUS"
    };

    public String selectRandomWord() {
        Random random = new Random();
        return WORDS[random.nextInt(WORDS.length)];
    }
}

