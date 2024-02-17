package ru.netology.pageobgect.page;

import com.codeborne.selenide.SelenideElement;
import ru.netology.pageobgect.data.DataHelper;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class VerificationPage {

    private final SelenideElement codeFiled = $("[data-test-id=code] input");

    private final SelenideElement verifyButton = $("[data-test-id=action-verify]");

    public VerificationPage() {
        codeFiled.shouldBe(visible);
    }

    public DashboardPage validVerify(DataHelper.VerificationCode verificationCode) {
        codeFiled.setValue(verificationCode.getCode());
        verifyButton.click();
        return new DashboardPage();

    }
}
