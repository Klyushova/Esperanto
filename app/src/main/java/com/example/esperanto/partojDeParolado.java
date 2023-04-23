package com.example.esperanto;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.esperanto.databinding.PartojBinding;


public class partojDeParolado extends Grammari {
     private PartojBinding binding;
    public static Intent newInstance(Context context) {

        return new Intent(context, partojDeParolado.class);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = PartojBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        switch (i) {
            case "chastiRechi":
                binding.textParto.setText("Члена неопределенного нет; есть только определенный (la), " +
                        "одинаковый для всех родов, падежей и чисел. \n" +
                        "Существительное всегда оканчивается на о. \n" +
                        "Пример: patro, kato \n" +
                        "Глагол по лицам и числам не изменяется (например: mi faras - я делаю, la patro faras - отец делает, ili faras - они делают). Формы глагола:\n" +
                        "а) Настоящее время принимает окончание as (например: mi faras - я делаю).\n" +
                        "b) Прошедшее - is (li faris - он делал).\n" +
                        "с) Будущее - os (ili faros - они будут делать).\n" +
                        "^c) Условное наклонение - us (^si farus - она бы делала).\n" +
                        "d) Повелительное наклонение - u (faru - делай, делайте).\n" +
                        "е) Неопределенное наклонение - i (fari - делать). \n" +
                        "Наречия оканчиваются на е. \n" +
                        "Прилагательное всегда оканчивается на а.");
                break;

            case "la":
                binding.textParto.setText("1) В языке Эсперанто присутствует определённый артикль la, \" +\n" +
                        "                        \"обозначающий то, что речь идёт об определённом предмете. \" +\n" +
                        "                        \"Иногда это слово переводится как \\\"этот\\\", \\\"сей\\\", \\\"известный\\\"." +
                        "2. Когда, говоря о чём-то или ком-то, обобществляют, т.е. думают о всех таких же: La homo (каждый человек) havas du piedojn." +
                        "3. Когда имеют в виду что-то целое: Donu al mi la kafon (всё, упомянутое или указываемое кофе)! La knabo manĝis la panon (весь или упомянутый хлеб)." +
                        "4. Обычно перед plej + прилагательное: Li estas la plej bona homo en la tuta mondo. Иногда перед plej + наречие (Margareto kantas la plej bele el ĉiuj), но этому подражать не следует." +
                        "Артикль не употребляется:\n" +
                        "\n" +
                        "1. Перед именем собственным. Следовательно, никогда \"la Kopenhago, la Eŭropo, la Petro, la Espera" +
                        "Артикль не употребляется также тогда, когда перед именем собственным находится какой-либо титул или другое слово, обозначающее ранг или профессию (sinjoro, sinjorino, fraŭlino, doktoro, advokato, ŝuisto, ŝoforo и т.д.)" +
                        "\n" +
                        "2. Перед названиями месяцев и дней недели" +
                        "\n" +
                        "3. Когда обобщённо говорят о веществах и временах года" +
                        "4. Когда ставится какое-либо другое определяемое слово (tiu, mia, via и т.д.)");
                break;
            case "vopross":
                binding.textParto.setText("Kiu? — кто? который? какой именно?\n" +
                        "\n" +
                        "Kiu vi estas? – Кто вы? Как вас зовут?\n" +
                        "\n" +
                        "Kio? – что? \n" +
                        "\n" +
                        "Kio ĝi estas? - Что это?\n"+"Kiu? — кто? который? какой именно?\n" +
                        "\n" +
                        "Kiu vi estas? – Кто вы? Как вас зовут?\n" +
                        "\n" +
                        "Kio? – что? \n" +
                        "\n" +
                        "Kio ĝi estas? - Что это?\n" +"Kiom? – сколько?         Kiom kostas la bileto?\n" +
                        "\n" +
                        " – Сколько стоит этот  билет?\n" +
                        "\n" +
                        "Kiam? – когда?\n" + " Kiam da jaroj vi havas? – Сколько вам лет?\n" +
                        "\n" +
                        "Kiel? – как? \n" + " Kiel vi pensas?  - Как ты думаешь?\n" +
                        "\n" +
                        "Kie? – где?\n" + "Kie estas miaj novaj kajeroj kaj skribiloj?\n" +
                        "\n" +
                        " –  Где мои новые тетради и ручки?\n" +
                        "\n" + "Kien? – куда?\n" +
                        " Kien vi iras? – Куда ты идешь?");


        }


        binding.tasko.setOnClickListener(view -> startActivity(FirstTasto.newInstance( this)));

    }
}
