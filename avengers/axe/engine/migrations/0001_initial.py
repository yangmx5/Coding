# Generated by Django 2.2.5 on 2020-01-21 12:13

from django.db import migrations, models


class Migration(migrations.Migration):

    initial = True

    dependencies = [
    ]

    operations = [
        migrations.CreateModel(
            name='Task',
            fields=[
                ('id', models.AutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('desc', models.CharField(max_length=255)),
                ('status', models.IntegerField(default=0)),
                ('is_important', models.BooleanField()),
                ('is_urgent', models.BooleanField()),
            ],
            options={
                'db_table': 'engine_task',
            },
        ),
    ]
